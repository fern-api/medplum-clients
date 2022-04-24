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
    as = ImmutableDevice.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device {
  Optional<code> language();

  Optional<List<Device_Property>> property();

  Optional<List<CodeableConcept>> safety();

  Optional<Reference> parent();

  Optional<Reference> definition();

  Optional<dateTime> manufactureDate();

  Optional<Reference> patient();

  Optional<List<Extension>> modifierExtension();

  Optional<String> modelNumber();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<String> serialNumber();

  Optional<List<CodeableConcept>> statusReason();

  Optional<id> id();

  Optional<List<Device_Version>> version();

  Optional<List<Device_UdiCarrier>> udiCarrier();

  Optional<DeviceStatus> status();

  Optional<uri> implicitRules();

  Optional<Reference> owner();

  Optional<List<Device_Specialization>> specialization();

  Optional<List<Annotation>> note();

  Optional<String> lotNumber();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<String> partNumber();

  Optional<CodeableConcept> type();

  Optional<String> manufacturer();

  Optional<List<ResourceList>> contained();

  Optional<List<Device_DeviceName>> deviceName();

  Optional<List<ContactPoint>> contact();

  Optional<uri> url();

  Optional<Reference> location();

  Optional<String> distinctIdentifier();

  Optional<dateTime> expirationDate();

  static ImmutableDevice.ResourceTypeBuildStage builder() {
    return ImmutableDevice.builder();
  }
}
