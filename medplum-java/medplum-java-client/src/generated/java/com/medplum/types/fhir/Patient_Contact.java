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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Address> address();

  Optional<List<ContactPoint>> telecom();

  Optional<Period> period();

  Optional<List<CodeableConcept>> relationship();

  Optional<Reference> organization();

  Optional<Patient_contactGender> gender();

  Optional<HumanName> name();

  static ImmutablePatient_Contact.Builder builder() {
    return ImmutablePatient_Contact.builder();
  }
}
