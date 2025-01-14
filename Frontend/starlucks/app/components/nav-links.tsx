'use client'
import React from "react";
import Link from 'next/link';
// import { signinform } from "./singinform";

const links = [
    // {name: 'Nirmal', href: '/Landing'},
    {name: 'Home', href: '/'},
    // {name: 'About', href: '#'},
    {name: 'Menu', href: '/menu'},
    {name: 'Sign in', href: 'SignInForm'},
    {name: 'Join now', href: 'JoinNowForm'}
];


export default function NabLinks() {
  return (
    <ul className="mt-2 mb-4 flex flex-row gap-2 lg:mb-0 lg:mt-0 lg:flex-row lg:items-center lg:gap-6">
        {links.map((link)=>{
        return(
              <Link
                key={link.name}
                href={link.href}
                className="flex items-center p-1 font-small blue-gray"
                >
                {link.name}
              </Link>
        );
      })}

    </ul>
  )
}
