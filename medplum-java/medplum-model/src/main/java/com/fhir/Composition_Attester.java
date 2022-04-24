package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableComposition_Attester.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_Attester {
  Optional<Reference> party();

  Optional<List<Extension>> modifierExtension();

  Optional<Composition_attesterMode> mode();

  Optional<dateTime> time();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableComposition_Attester.Builder builder() {
    return ImmutableComposition_Attester.builder();
  }
}
