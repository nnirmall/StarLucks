'use client'
import React from "react";
import { FirstComponent } from "../components/FirstComponent";
import Image from "next/image";
 
export default function Menu() {
  
  return (
    <>
    <section className="w-screen">
        <div className="flex flex-col items-center justify-items-center space-y-6  w-screen">
            <div className="block pt-5 m-8">
                <h1 className="font-sans text-5xl antialiased font-semibold leading-snug tracking-normal  text-[#243832] text-slate-50">
                We're on summertime
                </h1>
            </div>
        </div>
        <div className="flex flex-col space-y-10 ">

            <div className="flex flex-row ml-40 ">
               
                <div className=" bg-[#0920d2]">
                <h1 className="font-sans p-16 text-5xl antialiased font-semibold leading-snug tracking-normal text-white">
                Summer-Berry Starbuck
                </h1>
                <div className=" block w-96 m-8">
                        <h4 className="font-sans ml-36 text-xl antialiased font-semibold leading-snug tracking-normal text-slate-50">
                        Try Summer’s new fave—a mix of berry flavors over bursting raspberry flavored pearls, enjoyed alone or with lemonade or coconutmilk.
                        </h4>
                    </div>
                    <button className="mt-6  ml-52 block w-auto select-none rounded-lg bg-gray-900 py-3 px-6 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none" 
                    >
                        order now
                    </button>
                </div>
                <Image
                    width={640}
                    className=""
                    height={500}
                    src={'/second.png'}
                    alt="coffee pics"
                />
            </div>
            <div className="flex flex-row  w-screen">
                <Image
                    width={640}
                    className="ml-40"
                    height={500}
                    src={'/firstSmall.png'}
                    alt="coffee pics"
                />
                <div className=" bg-[#243832] ">
                <h1 className="font-sans p-16 text-5xl antialiased font-semibold leading-snug tracking-normal text-white">
                        Introducing Iced Energy
                </h1>
                <div className=" block w-96 m-8">
                        <h4 className="font-sans ml-36 text-xl antialiased font-semibold leading-snug tracking-normal text-slate-50">
                        Elevate your day with a powerful boost of sugar-free energy crafted with sparkling fruit flavors and iced tea.​ (Available Venti Only)
                        </h4>
                    </div>
                    <button className="mt-6 ml-52 block w-auto select-none rounded-lg bg-gray-900 py-3 px-6 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none" 
                    >
                        order now
                    </button>
                </div>
            </div>
            <div className="flex flex-row  w-screen">
                <Image
                    width={640}
                    className="ml-40"
                    height={500}
                    src={'/third.png'}
                    alt="coffee pics"
                />
                <div className=" bg-[#f7de71]">
                <h1 className="font-sans p-16 text-5xl antialiased font-semibold leading-snug tracking-normal text-black">
                White Chocolate Macad
                </h1>
                <div className=" block w-96 m-8">
                        <h4 className="font-sans ml-36 text-xl antialiased font-semibold leading-snug tracking-normal text-black">
                        Cold brew topped with lush white chocolate macadamia cream cold foam and toasted cookie crumbles.
                        </h4>
                    </div>
                    <button className="mt-6 ml-52 block w-auto select-none rounded-lg bg-gray-900 py-3 px-6 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none" 
                    >
                        order now
                    </button>
                </div>
            </div>
            <div className="flex flex-row  w-screen">
                <Image
                    width={640}
                    className="ml-40"
                    height={500}
                    src={'/fourth.png'}
                    alt="coffee pics"
                />
                <div className=" bg-[#c34623]">
                <h1 className="font-sans p-16 text-5xl antialiased font-semibold leading-snug tracking-normal text-white">
                Nondairy Vanilla Sweets 
                </h1>
                <div className=" block w-96 m-8">
                        <h4 className="font-sans ml-36 text-xl antialiased font-semibold leading-snug tracking-normal text-slate-50">
                        Our signature cold brew sweetened with vanilla and topped with a creamy float of nondairy vanilla sweet cream.
                        </h4>
                    </div>
                    <button className="mt-6 ml-52 block w-auto select-none rounded-lg bg-gray-900 py-3 px-6 text-center align-middle font-sans text-xs font-bold uppercase text-white shadow-md shadow-gray-900/10 transition-all hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none disabled:pointer-events-none disabled:opacity-50 disabled:shadow-none" 
                    >
                        order now
                    </button>
                </div>
            </div>

        </div>
     

    </section>

    </>
  );
}