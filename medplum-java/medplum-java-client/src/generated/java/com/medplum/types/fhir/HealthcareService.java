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
    as = ImmutableHealthcareService.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface HealthcareService {
  Optional<List<HealthcareService_Eligibility>> eligibility();

  Optional<List<HealthcareService_NotAvailable>> notAvailable();

  Optional<Attachment> photo();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<String> comment();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> referralMethod();

  Optional<List<ContactPoint>> telecom();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Reference>> location();

  Optional<Boolean> appointmentRequired();

  Optional<List<CodeableConcept>> category();

  Optional<Markdown> extraDetails();

  String resourceType();

  Optional<List<HealthcareService_AvailableTime>> availableTime();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> program();

  Optional<List<Reference>> coverageArea();

  Optional<List<CodeableConcept>> serviceProvisionCode();

  Optional<Reference> providedBy();

  Optional<Boolean> active();

  Optional<String> availabilityExceptions();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<List<CodeableConcept>> communication();

  Optional<List<Reference>> endpoint();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> type();

  Optional<List<CodeableConcept>> characteristic();

  static ImmutableHealthcareService.ResourceTypeBuildStage builder() {
    return ImmutableHealthcareService.builder();
  }
}
