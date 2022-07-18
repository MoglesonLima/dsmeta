import React from 'react';

import logo from "../../assets/img/logo-dsmeta.png"
import "./styles.css"


function Header(){
    return(
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSmeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por 
                    <a href="https://www.instagram.com/mogly_lima"> @mogly_lima</a>
                </p>
            </div>
        </header>
    )
}

export default Header