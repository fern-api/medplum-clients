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
  String resourceType();

  Optional<List<Reference>> endpoint();

  Optional<List<CodeableConcept>> code();

  Optional<List<Reference>> healthcareService();

  Optional<Code> language();

  Optional<Reference> organization();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> location();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<String> availabilityExceptions();

  Optional<Reference> practitioner();

  Optional<List<ContactPoint>> telecom();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<PractitionerRole_NotAvailable>> notAvailable();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<Period> period();

  Optional<List<PractitionerRole_AvailableTime>> availableTime();

  Optional<Meta> meta();

  static ImmutablePractitionerRole.ResourceTypeBuildStage builder() {
    return ImmutablePractitionerRole.builder();
  }
}
