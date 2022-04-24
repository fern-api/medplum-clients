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
    as = ImmutableCodeSystem_Concept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Concept {
  Optional<List<CodeSystem_Designation>> designation();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<code> code();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<String> definition();

  Optional<List<CodeSystem_Property1>> property();

  Optional<String> id();

  Optional<String> display();

  static ImmutableCodeSystem_Concept.Builder builder() {
    return ImmutableCodeSystem_Concept.builder();
  }
}
