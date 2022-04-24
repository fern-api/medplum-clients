package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coding {
  Optional<List<Extension>> extension();

  Optional<code> code();

  Optional<uri> system();

  Optional<String> display();

  Optional<String> id();

  Optional<String> version();

  Optional<Boolean> userSelected();

  static ImmutableCoding.Builder builder() {
    return ImmutableCoding.builder();
  }
}
