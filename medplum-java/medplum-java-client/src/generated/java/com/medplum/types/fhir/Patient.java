package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePatient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient {
  Optional<CodeableConcept> maritalStatus();

  Optional<Date> birthDate();

  Optional<Code> language();

  Optional<List<Reference>> generalPractitioner();

  Optional<List<HumanName>> name();

  Optional<String> deceasedDateTime();

  Optional<Uri> implicitRules();

  Optional<List<Attachment>> photo();

  Optional<List<ResourceList>> contained();

  Optional<PatientGender> gender();

  Optional<Boolean> deceasedBoolean();

  Optional<Double> multipleBirthInteger();

  String resourceType();

  Optional<Id> id();

  Optional<Boolean> active();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> managingOrganization();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Address>> address();

  Optional<Boolean> multipleBirthBoolean();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<List<Patient_Contact>> contact();

  Optional<List<Patient_Communication>> communication();

  Optional<List<Patient_Link>> link();

  Optional<List<Extension>> modifierExtension();

  static ImmutablePatient.ResourceTypeBuildStage builder() {
    return ImmutablePatient.builder();
  }
}
