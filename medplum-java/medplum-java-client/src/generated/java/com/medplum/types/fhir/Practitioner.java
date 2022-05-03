package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePractitioner.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner {
  Optional<Id> id();

  Optional<List<ContactPoint>> telecom();

  Optional<Uri> implicitRules();

  Optional<List<Attachment>> photo();

  Optional<List<CodeableConcept>> communication();

  Optional<Boolean> active();

  Optional<Code> language();

  Optional<PractitionerGender> gender();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<HumanName>> name();

  Optional<List<Address>> address();

  Optional<List<Practitioner_Qualification>> qualification();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> birthDate();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  String resourceType();

  static ImmutablePractitioner.ResourceTypeBuildStage builder() {
    return ImmutablePractitioner.builder();
  }
}
