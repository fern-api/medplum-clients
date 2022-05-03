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
  Optional<Code> language();

  String resourceType();

  Optional<List<Reference>> location();

  Optional<Period> period();

  Optional<List<ResourceList>> contained();

  Optional<List<PractitionerRole_AvailableTime>> availableTime();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> practitioner();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> code();

  Optional<Boolean> active();

  Optional<List<PractitionerRole_NotAvailable>> notAvailable();

  Optional<String> availabilityExceptions();

  Optional<List<Reference>> endpoint();

  Optional<List<Reference>> healthcareService();

  Optional<Reference> organization();

  Optional<Narrative> text();

  static ImmutablePractitionerRole.ResourceTypeBuildStage builder() {
    return ImmutablePractitionerRole.builder();
  }
}
