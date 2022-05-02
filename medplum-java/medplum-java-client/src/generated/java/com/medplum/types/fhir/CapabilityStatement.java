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
    as = ImmutableCapabilityStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement {
  Optional<Uri> url();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<CapabilitystatementFhirversion> fhirVersion();

  Optional<Id> id();

  Optional<Boolean> experimental();

  Optional<CapabilityStatement_Software> software();

  Optional<List<Code>> format();

  Optional<CapabilitystatementKind> kind();

  Optional<CapabilityStatement_Implementation> implementation();

  Optional<List<CapabilityStatement_Rest>> rest();

  Optional<String> publisher();

  Optional<List<CapabilityStatement_Document>> document();

  Optional<Markdown> description();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> contact();

  Optional<List<Code>> patchFormat();

  Optional<List<Canonical>> implementationGuide();

  Optional<CapabilitystatementStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<String> version();

  Optional<List<CapabilityStatement_Messaging>> messaging();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<List<Canonical>> instantiates();

  Optional<String> name();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<String> title();

  Optional<List<Canonical>> imports();

  static ImmutableCapabilityStatement.ResourceTypeBuildStage builder() {
    return ImmutableCapabilityStatement.builder();
  }
}
