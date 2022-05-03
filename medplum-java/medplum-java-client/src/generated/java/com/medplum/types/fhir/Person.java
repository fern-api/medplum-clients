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
  String resourceType();

  Optional<Attachment> photo();

  Optional<Code> language();

  Optional<List<Person_Link>> link();

  Optional<List<Extension>> extension();

  Optional<Date> birthDate();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<HumanName>> name();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> modifierExtension();

  Optional<PersonGender> gender();

  Optional<List<Address>> address();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Reference> managingOrganization();

  static ImmutablePerson.ResourceTypeBuildStage builder() {
    return ImmutablePerson.builder();
  }
}
