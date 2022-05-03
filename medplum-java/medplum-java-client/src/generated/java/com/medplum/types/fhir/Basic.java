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
    as = ImmutableBasic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Basic {
  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Reference> subject();

  CodeableConcept code();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Reference> author();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Date> created();

  Optional<List<ResourceList>> contained();

  static ImmutableBasic.CodeBuildStage builder() {
    return ImmutableBasic.builder();
  }
}
