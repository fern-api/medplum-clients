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
  Optional<Boolean> experimental();

  Optional<String> title();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Meta> meta();

  Optional<StructureDefinition_Snapshot> snapshot();

  Optional<List<StructureDefinition_Context>> context();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<StructuredefinitionDerivation> derivation();

  Optional<StructureDefinition_Differential> differential();

  Optional<List<Extension>> extension();

  Optional<List<UsageContext>> useContext();

  Optional<Uri> type();

  Optional<Markdown> description();

  Optional<List<String>> contextInvariant();

  Optional<Markdown> copyright();

  Optional<StructuredefinitionFhirversion> fhirVersion();

  Optional<Code> language();

  Optional<StructuredefinitionStatus> status();

  Optional<List<Coding>> keyword();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  Optional<StructuredefinitionKind> kind();

  Optional<Markdown> purpose();

  Optional<List<Identifier>> identifier();

  Optional<Canonical> baseDefinition();

  Optional<Uri> implicitRules();

  Optional<List<StructureDefinition_Mapping>> mapping();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<String> version();

  Optional<Id> id();

  Optional<String> publisher();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  static ImmutableStructureDefinition.ResourceTypeBuildStage builder() {
    return ImmutableStructureDefinition.builder();
  }
}
