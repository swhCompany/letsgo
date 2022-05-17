import React, { useContext, useState, useEffect } from 'react'
import './Banner.css'
import image1 from '../../images/image1.jpg'
import image2 from '../../images/image2.jpg'
import image3 from '../../images/image3.jpg'
import axios from 'axios'

const Banner = (props) => {
    const [top1, setTop1] = useState("");
    const [top2, setTop2] = useState("");
    const [top3, setTop3] = useState("");

    axios.get('http://localhost:8090/letsgo/banner')
    .then((Response) => {
        const places = Response.data;
        setTop1(places[0].placeName)
        setTop2(places[1].placeName)
        setTop3(places[2].placeName)
        console.log(top1);
    
    })
    .catch((Error) => {console.log(Error)})

  return (
    <div className='banner__container'>
        <div className='banner__desc'>
            <h1>금주의 장소 추천</h1>
        </div>

        <div className='banner__content'>
            
            <a href="" className='banner__box'>
                <img className='banner__row' src={image1}></img>
                <p className='banner__text'>{top1}</p>
            </a>

            <a href="" className='banner__box'>
                <img className='banner__row' src={image2}></img>
                <p className='banner__text'>{top2}</p>
            </a>

            <a href="" className='banner__box'>
                <img className='banner__row' src={image3}></img>
                <p className='banner__text'>{top3}</p>
            </a>

        </div>
    </div>
  )
};

export default Banner;