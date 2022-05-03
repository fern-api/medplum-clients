package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> display();

  Optional<Boolean> userSelected();

  Optional<Uri> system();

  Optional<String> version();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Code> code();

  static ImmutableCoding.Builder builder() {
    return ImmutableCoding.builder();
  }
}
