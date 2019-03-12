# my -> (estatico)
# local -> dinamico

$x = 0;
 
sub printX {
  return $x;
}
 
sub estatico {
  my $x = 1; 
  return printX();
}
 
sub dinamico {
  local $x = 1;
  return printX();
}

print "Estatico: ";
print estatico(); # 0
print "\n";
print "Dinamico: ";
print dinamico(); # 1