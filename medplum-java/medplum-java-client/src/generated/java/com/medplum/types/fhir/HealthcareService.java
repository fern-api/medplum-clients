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
  Optional<List<ContactPoint>> telecom();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> program();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> location();

  Optional<Attachment> photo();

  Optional<List<Extension>> extension();

  Optional<String> availabilityExceptions();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> referralMethod();

  Optional<Markdown> extraDetails();

  Optional<Id> id();

  Optional<String> comment();

  Optional<Reference> providedBy();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<HealthcareService_NotAvailable>> notAvailable();

  Optional<List<CodeableConcept>> type();

  Optional<List<Reference>> endpoint();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<List<HealthcareService_Eligibility>> eligibility();

  Optional<List<ResourceList>> contained();

  Optional<List<HealthcareService_AvailableTime>> availableTime();

  Optional<Boolean> appointmentRequired();

  Optional<List<Reference>> coverageArea();

  Optional<List<CodeableConcept>> specialty();

  String resourceType();

  Optional<List<CodeableConcept>> characteristic();

  Optional<List<CodeableConcept>> communication();

  Optional<Code> language();

  Optional<List<CodeableConcept>> serviceProvisionCode();

  static ImmutableHealthcareService.ResourceTypeBuildStage builder() {
    return ImmutableHealthcareService.builder();
  }
}
