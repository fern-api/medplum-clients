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
  Optional<Period> period();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Reference> encounter();

  Optional<Reference> author();

  Optional<List<Identifier>> identifier();

  Reference subject();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<FlagStatus> status();

  Optional<List<CodeableConcept>> category();

  static ImmutableFlag.SubjectBuildStage builder() {
    return ImmutableFlag.builder();
  }
}
