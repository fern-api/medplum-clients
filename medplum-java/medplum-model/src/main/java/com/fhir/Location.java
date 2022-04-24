package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableLocation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location {
  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> endpoint();

  Optional<LocationMode> mode();

  Optional<CodeableConcept> physicalType();

  Optional<Location_Position> position();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> type();

  Optional<String> name();

  Optional<String> description();

  Optional<id> id();

  Optional<List<String>> alias();

  Optional<Address> address();

  Optional<Reference> managingOrganization();

  Optional<Narrative> text();

  Optional<LocationStatus> status();

  Optional<Coding> operationalStatus();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<uri> implicitRules();

  Optional<List<Location_HoursOfOperation>> hoursOfOperation();

  Optional<Meta> meta();

  Optional<String> availabilityExceptions();

  Optional<Reference> partOf();

  Optional<List<ContactPoint>> telecom();

  String resourceType();

  static ImmutableLocation.ResourceTypeBuildStage builder() {
    return ImmutableLocation.builder();
  }
}
