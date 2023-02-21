import React, { useState } from 'react'

export const Login = (props) =>{
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');
    
    const handleSubmit = (e) => {
         e.preventDefault();
         console.log(email);
    }

    async function loginHome(){
      console.warn(email,pass)
      let item={email,pass}
    }
    return (
      <div className='auth-form-container'>
        <h2>Login</h2>  
            <form className="login-form" onSubmit={handleSubmit}>
                <label htmlFor="email">E-mail</label>
                <input value = {email} onChange={(e) => setEmail(e.target.value)}type = "email" placeholder='Please enter your Email address' id="email" name="email"></input>
                <label htmlFor="password">Password</label>
                <input value = {pass} onChange={(e) => setPass(e.target.value)}type = "password" placeholder='Password' id="password" name="password"></input>
                <button onClick={loginHome} className="btn btn-primary" type="submit">Log In</button>
            </form>
            <button className='link-btn' onClick={() => props.onFormSwitch('register')}>Don't have an account? Register here.</button>
      </div>
    )
}
export default Login