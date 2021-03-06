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
    as = ImmutableInsurancePlan_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Contact {
  Optional<HumanName> name();

  Optional<List<ContactPoint>> telecom();

  Optional<CodeableConcept> purpose();

  Optional<String> id();

  Optional<Address> address();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableInsurancePlan_Contact.Builder builder() {
    return ImmutableInsurancePlan_Contact.builder();
  }
}
