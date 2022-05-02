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
  Optional<Id> id();

  Optional<Date> birthDate();

  Optional<List<Attachment>> photo();

  Optional<Code> language();

  Optional<List<Address>> address();

  Optional<Uri> implicitRules();

  Optional<String> deceasedDateTime();

  Optional<Boolean> multipleBirthBoolean();

  Optional<List<Patient_Contact>> contact();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Patient_Communication>> communication();

  Optional<List<HumanName>> name();

  Optional<List<Patient_Link>> link();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  Optional<List<Reference>> generalPractitioner();

  Optional<Reference> managingOrganization();

  String resourceType();

  Optional<CodeableConcept> maritalStatus();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> deceasedBoolean();

  Optional<Double> multipleBirthInteger();

  Optional<Meta> meta();

  Optional<PatientGender> gender();

  static ImmutablePatient.ResourceTypeBuildStage builder() {
    return ImmutablePatient.builder();
  }
}
