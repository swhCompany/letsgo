import React, {useState} from 'react'
import './Search.css'
import axios from 'axios'


const Search = () => {
    const [sidoState, setSidoState] = useState("경기도");
    const [sigunguState, setSigunguState] = useState("");
    const [placeState, setPlaceState] = useState("0");
    const [searchData1, setSearchData1] = useState("");
    const [searchData2, setSearchData2] = useState("");
    const [searchData3, setSearchData3] = useState("");
    

    const SelectBox = () => {
        const handleChange = (e) => {
            setPlaceState(e.target.value)
            console.log(e.target.value);
        };
        return (
            <select onChange={handleChange} value={placeState}>
                <option >장소구분</option>
                <option value="0" key="library">도서관</option>
                <option value="1" key="village">농어촌 체험마을</option>
                <option value="2" key="forest">휴양림</option>
            </select>
        )
    }
    const handleSidoChange = (e) => {
        setSidoState(e.target.value);
    }
    const handleSigunguChange = (e) => {
        setSigunguState(e.target.value);
    }
    const handleSubmit = () => {
        // alert("value : " + sidoState +","+sigunguState);
        // console.log(sigunguState);
        searchPost()

    }
    const searchPost = () => {
        axios.post("http://localhost:8090/letsgo/search",{
            type: placeState,
            headerArea: sidoState,
            headerRegion: sigunguState
        }).then(function (response) {
            const items = response.data.response.body.items;
            console.log(items);
            if(placeState === "0"){
                if(items.length < 3){
                    alert("검색하신 지역의 해당 장소가 2개 이하라 화면에 표시되지 않습니다.")
                }else{
                    setSearchData1(items[0].lbrryNm+", "+items[0].rdnmadr+", "+items[0].phoneNumber)
                    setSearchData2(items[1].lbrryNm+", "+items[1].rdnmadr+", "+items[1].phoneNumber)
                    setSearchData3(items[2].lbrryNm+", "+items[2].rdnmadr+", "+items[2].phoneNumber)
                }
            }
            else if(placeState === "1"){
                if(items.length < 3){
                    alert("검색하신 지역의 해당 장소가 2개 이하라 화면에 표시되지 않습니다.")
                }else{
                    setSearchData1(items[0].exprnVilageNm+", "+items[0].rdnmadr+", "+items[0].phoneNumber)
                    setSearchData2(items[1].exprnVilageNm+", "+items[1].rdnmadr+", "+items[1].phoneNumber)
                    setSearchData3(items[2].exprnVilageNm+", "+items[2].rdnmadr+", "+items[2].phoneNumber)
                }
            }
            else if(placeState === "2"){
                if(items.length < 3){
                    alert("검색하신 지역의 해당 장소가 2개 이하라 화면에 표시되지 않습니다.")
                }else{
                    setSearchData1(items[0].rcrfrstNm+", "+items[0].rdnmadr+", "+items[0].telephoneNumber)
                    setSearchData2(items[1].rcrfrstNm+", "+items[1].rdnmadr+", "+items[1].telephoneNumber)
                    setSearchData3(items[2].rcrfrstNm+", "+items[2].rdnmadr+", "+items[2].telephoneNumber)
                }
            }
            else{
                alert("올바르지 않은 접근입니다")
                window.location.reload()
            }
        }).catch(function (error) {
            console.log("에러에러");
            // window.location.reload()
        })
    }
  return (
    <form>
        <SelectBox />
        <input type="text" class="a" value={sidoState.value} onChange={handleSidoChange} placeholder="시도"/>
        <input type={placeState==="2"?"hidden":"text"} class="b" value={sigunguState.value} onChange={handleSigunguChange} placeholder="시군구"/>


        <input type="button" class="c"  value="검색"onClick={handleSubmit} />
        <div className='list'>
            <br />
            {searchData1}
            <br />
            {searchData2}
            <br />
            {searchData3}
        </div>
 

    </form>
  )
}

export default Search