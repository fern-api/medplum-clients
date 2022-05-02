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
    as = ImmutablePerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person {
  Optional<List<Address>> address();

  Optional<Reference> managingOrganization();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<PersonGender> gender();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<HumanName>> name();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Date> birthDate();

  Optional<Code> language();

  Optional<Attachment> photo();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<List<Person_Link>> link();

  Optional<List<ContactPoint>> telecom();

  static ImmutablePerson.ResourceTypeBuildStage builder() {
    return ImmutablePerson.builder();
  }
}
