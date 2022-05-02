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
    as = ImmutableOrganization_Contact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Organization_Contact {
  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> extension();

  Optional<HumanName> name();

  Optional<CodeableConcept> purpose();

  Optional<List<Extension>> modifierExtension();

  Optional<Address> address();

  Optional<String> id();

  static ImmutableOrganization_Contact.Builder builder() {
    return ImmutableOrganization_Contact.builder();
  }
}
