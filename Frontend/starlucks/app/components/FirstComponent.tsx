'use client'
import { Button } from "@material-tailwind/react";
import Image from "next/image";
import React from "react";

export function FirstComponent() {
  return (
    <>
    <section>
        <div className="flex flex-row p-8 m-5">
            <Image
                width={720}
                height={625}
                src={'/first.png'}
                alt="coffee pics"
            />
            <div className="flex flex-col items-center justify-items-center space-y-6  bg-[#243832] w-screen">
                <div className="block pt-40 m-8">
                    <h1 className="font-sans text-5xl antialiased font-semibold leading-snug tracking-normal text-slate-50">
                    Introducing Iced Energy
                    </h1>
                </div>
                <div className=" block w-96 m-8">
                    <h4 className="font-sans text-xl antialiased font-semibold leading-snug tracking-normal text-slate-50">
                    Elevate your day with a powerful boost of sugar-free energy crafted with sparkling fruit flavors and iced tea.​ (Available Venti Only)
                    </h4>
                </div>
                <button className="mt-6 block w-auto select-none rounded-lg bg-gray-900 py-3 px-6 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none" 
                >
                    order now
                </button>

            </div>
        </div>
     

    </section>
    </>
  );
}