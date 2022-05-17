import React from 'react';
import classes from './Header.module.css';
// import HeaderNav from './HeaderNav'
import logo from '../../images/logo.png'

const Header = () => {
  return (
    <div>
      {/* <HeaderNav/> */}
        <header className={classes.header}>
            <img src={logo} />

        </header>
        {/* <HeaderNav/> */}

    </div>
  )
}

export default Header