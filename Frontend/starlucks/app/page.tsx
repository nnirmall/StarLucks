import Image from "next/image";
import { StickyNavbar } from "./components/StickyNavbar";
import { FirstComponent } from "./components/FirstComponent";

export default function Home() {
  return (
    <main >
      <StickyNavbar/>
      <FirstComponent/>
    </main>
  );
}