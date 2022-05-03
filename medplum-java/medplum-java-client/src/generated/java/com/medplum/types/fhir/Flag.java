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
  Optional<Id> id();

  Optional<Narrative> text();

  CodeableConcept code();

  Optional<Meta> meta();

  Optional<Period> period();

  Reference subject();

  Optional<Reference> author();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<FlagStatus> status();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  static ImmutableFlag.CodeBuildStage builder() {
    return ImmutableFlag.builder();
  }
}
