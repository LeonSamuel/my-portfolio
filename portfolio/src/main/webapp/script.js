/** Fetches the current date from the server and adds it to the page. */
async function hello() {
   console.log("Clicked Button");
  const responseFromServer = await fetch('/hello');
  const textFromResponses = await responseFromServer.json();
  
  const textFromResponse = textFromResponses[Math.floor(Math.random() * textFromResponses.length)];

  const random_idea_container = document.getElementById('random_idea_container');
  random_idea_container.innerText = textFromResponse;

}

  /* 
    // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;

  const dateContainer = document.getElementById('random_idea_container');
  dateContainer.innerText = '';

  dateContainer.appendChild(
      createListElement(textFromResponse[0]));
  dateContainer.appendChild(
      createListElement(textFromResponse[1]));
  dateContainer.appendChild(
      createListElement(textFromResponse[2]));
}
*/
/* 
 //Creates an <li> element containing text.
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}
*/
  
