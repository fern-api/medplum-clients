package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Composition_attesterMode> mode();

  Optional<Reference> party();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> time();

  Optional<String> id();

  static ImmutableComposition_Attester.Builder builder() {
    return ImmutableComposition_Attester.builder();
  }
}
