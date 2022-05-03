package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    as = ImmutableStructureDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition {
  Optional<String> name();

  Optional<List<Identifier>> identifier();

  Optional<StructuredefinitionStatus> status();

  Optional<StructureDefinition_Snapshot> snapshot();

  Optional<String> title();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<List<Coding>> keyword();

  Optional<StructureDefinition_Differential> differential();

  Optional<List<Extension>> modifierExtension();

  Optional<StructuredefinitionKind> kind();

  Optional<Uri> url();

  Optional<Uri> type();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<String> publisher();

  Optional<StructuredefinitionFhirversion> fhirVersion();

  Optional<List<UsageContext>> useContext();

  Optional<Canonical> baseDefinition();

  Optional<String> version();

  Optional<List<StructureDefinition_Mapping>> mapping();

  String resourceType();

  Optional<List<StructureDefinition_Context>> context();

  Optional<List<String>> contextInvariant();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<StructuredefinitionDerivation> derivation();

  Optional<Markdown> copyright();

  static ImmutableStructureDefinition.ResourceTypeBuildStage builder() {
    return ImmutableStructureDefinition.builder();
  }
}
