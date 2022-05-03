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
    as = ImmutablePatient_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient_Contact {
  Optional<List<CodeableConcept>> relationship();

  Optional<Patient_contactGender> gender();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<HumanName> name();

  Optional<String> id();

  Optional<Address> address();

  Optional<Period> period();

  Optional<Reference> organization();

  static ImmutablePatient_Contact.Builder builder() {
    return ImmutablePatient_Contact.builder();
  }
}
