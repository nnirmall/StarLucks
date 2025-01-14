import { StickyNavbar } from "../components/StickyNavbar"

export default function JoinNowFormLayout({
    children, // will be a page or nested layout
  }: {
    children: React.ReactNode
  }) {
    return (
      <section>
        <StickyNavbar/>
   
        {children}
      </section>
    )
  }