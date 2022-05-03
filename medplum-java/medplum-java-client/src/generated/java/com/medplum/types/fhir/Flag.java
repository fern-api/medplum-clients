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
    as = ImmutableFlag.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Flag {
  CodeableConcept code();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<CodeableConcept>> category();

  Reference subject();

  Optional<Meta> meta();

  Optional<Reference> encounter();

  Optional<Reference> author();

  Optional<FlagStatus> status();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  Optional<Uri> implicitRules();

  static ImmutableFlag.CodeBuildStage builder() {
    return ImmutableFlag.builder();
  }
}
