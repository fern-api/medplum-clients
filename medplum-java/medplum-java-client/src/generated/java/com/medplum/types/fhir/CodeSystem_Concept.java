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
    as = ImmutableCodeSystem_Concept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Concept {
  Optional<Code> code();

  Optional<String> definition();

  Optional<List<CodeSystem_Designation>> designation();

  Optional<List<Extension>> modifierExtension();

  Optional<String> display();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CodeSystem_Property1>> property();

  static ImmutableCodeSystem_Concept.Builder builder() {
    return ImmutableCodeSystem_Concept.builder();
  }
}
