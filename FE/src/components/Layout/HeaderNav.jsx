import React, { useState, useEffect } from 'react'
import './HeaderNav.css'
import classes from './Header.module.css';
import logo from '../../images/logo.png'

const Header = (props) => {

  const [show, handleShow] = useState(false);

  useEffect(() => {
    window.addEventListener('scroll', () => {
      if (window.scrollY > 100) {
        handleShow(true);
      } else handleShow(false);
    });
    return () => {
      window.removeEventListener('scroll');
    };
  }, []);

  return (
    <>
      <div className={`header_nav ${show && "headernav__blue"}`}>

      <header className={classes.header}>
            <img src={logo} />

        </header>

      </div>

    </>

  )
}

export default Header
