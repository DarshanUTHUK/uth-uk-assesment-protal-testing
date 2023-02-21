import React, { useState } from 'react'
import Axios from 'axios'

export const Register = (props) =>{
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');

    const register = function(){
        console.log(email);
        console.log(pass);
        Axios.post('http://localhost:3001/register',{
            username : email, 
            password : pass
        }).then((response) =>{
            console.log(response);
        });
    };
    
    return (
        <div className='auth-form-container'>  
        <h2>Register</h2>  
            <form className="register-form">
                <label htmlFor="name">Full-Name</label>
                <input type = "text" placeholder='Enter your Full-name' id="name" name="name"></input>
                <label htmlFor="gender">Gender</label>
                <input type = "text" placeholder='Gender type "Male"/"Female"' id="gender" name="gender"></input>
                <label htmlFor="address">Address</label>
                <input type = "text" placeholder='Enter complete addr with pin-code' id="address" name="address"></input>
                <label htmlFor="phone">Phone</label>
                <input type = "text" placeholder='Enter Phone Number' id="phone" name="phone"></input>
                <label htmlFor="email">E-mail</label>
                <input onChange={(e) => setEmail(e.target.value)} type = "email" placeholder='Please enter your Email address' id="email" name="email"></input>
                <label htmlFor="password">Password</label>
                <input onChange={(e) => setPass(e.target.value)} type = "password" placeholder='Password' id="password" name="password"></input>
                <button onClick={register}>Register</button>
            </form>
            <button className='link-btn' onClick={() => props.onFormSwitch('login')}>Already have an account? Login here.</button>
      </div>
    )
}

export default Register
