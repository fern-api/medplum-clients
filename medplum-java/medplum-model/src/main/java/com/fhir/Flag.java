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
    as = ImmutableFlag.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Flag {
  Optional<List<ResourceList>> contained();

  Optional<FlagStatus> status();

  Optional<List<Extension>> extension();

  Optional<uri> implicitRules();

  Optional<Period> period();

  CodeableConcept code();

  Optional<Reference> author();

  Optional<List<Identifier>> identifier();

  Reference subject();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<Reference> encounter();

  static ImmutableFlag.CodeBuildStage builder() {
    return ImmutableFlag.builder();
  }
}
