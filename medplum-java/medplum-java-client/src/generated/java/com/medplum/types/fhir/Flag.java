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
  Optional<Code> language();

  CodeableConcept code();

  Reference subject();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> author();

  Optional<Narrative> text();

  Optional<Period> period();

  Optional<Id> id();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  Optional<FlagStatus> status();

  Optional<List<CodeableConcept>> category();

  static ImmutableFlag.CodeBuildStage builder() {
    return ImmutableFlag.builder();
  }
}
