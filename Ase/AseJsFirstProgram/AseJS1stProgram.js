function reverseWord(word){
    let rev_word=""
    for(let i=word.length-1;i>=0;i--){
        rev_word=rev_word+word[i]
    }
    return rev_word
}
let sent=prompt("Enter a sentence")
let words=sent.split(" ")
for(let i=0;i<words.length;i++){
    words[i]=reverseWord(words[i])
}
let result=words.join(" ")
console.log(`The resut after reversing each word in sentence is: ${result}`)