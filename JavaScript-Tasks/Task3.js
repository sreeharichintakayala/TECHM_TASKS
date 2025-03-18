function getCurrentDate(){
    const now = new Date();
    const day = String(now.getDate()).padStart(2,'0');
    const month = String(now.getMonth() + 1).padStart(2,'0');
    const year = now.getFullYear();
    const format1 = `${month}-${day}-${year}`;
    const format2 = `${month}/${day}/${year}`;
    const format3 = `${day}-${month}-${year}`;
    const format4 = `${day}/${month}/${year}`;
    console.log(`mm-dd-yyyy: ${format1}`);
    console.log(`mm/dd/yyyy: ${format2}`);
    console.log(`dd-mm-yyyy: ${format3}`);
    console.log(`dd/mm/yyyy: ${format4}`);
}
getCurrentDate();