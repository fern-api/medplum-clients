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
    as = ImmutablePractitionerRole.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PractitionerRole {
  Optional<List<ContactPoint>> telecom();

  Optional<List<PractitionerRole_AvailableTime>> availableTime();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> location();

  Optional<List<Reference>> endpoint();

  Optional<List<CodeableConcept>> specialty();

  Optional<String> availabilityExceptions();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Reference> organization();

  Optional<Period> period();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Reference>> healthcareService();

  Optional<List<PractitionerRole_NotAvailable>> notAvailable();

  Optional<List<CodeableConcept>> code();

  Optional<Meta> meta();

  Optional<Reference> practitioner();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Boolean> active();

  Optional<Id> id();

  static ImmutablePractitionerRole.ResourceTypeBuildStage builder() {
    return ImmutablePractitionerRole.builder();
  }
}
