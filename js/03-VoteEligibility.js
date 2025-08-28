//Write a program that accepts a number (age) and checks whether the person is eligible to vote. A person is eligible if their age is 18 or more.

function VoteEligibility(age) {
  if (age >= 18) {
    return "Your ELigible to Vote";
  } else {
    return "Your Not ELigible To Vote";
  }
}

const kiran_vote_eligibility = VoteEligibility(24);

console.log(kiran_vote_eligibility);
