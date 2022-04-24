package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<dateTime> date();

  Optional<markdown> description();

  Optional<uri> implicitRules();

  Optional<List<StructureDefinition_Mapping>> mapping();

  Optional<StructuredefinitionKind> kind();

  @JsonProperty("abstract")
  Optional<Boolean> _abstract();

  Optional<String> title();

  Optional<markdown> purpose();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<markdown> copyright();

  Optional<Narrative> text();

  Optional<uri> type();

  Optional<List<Identifier>> identifier();

  Optional<uri> url();

  Optional<StructuredefinitionDerivation> derivation();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<List<String>> contextInvariant();

  Optional<StructureDefinition_Differential> differential();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<StructuredefinitionStatus> status();

  Optional<StructuredefinitionFhirversion> fhirVersion();

  Optional<List<Coding>> keyword();

  Optional<StructureDefinition_Snapshot> snapshot();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<StructureDefinition_Context>> context();

  Optional<canonical> baseDefinition();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<Boolean> experimental();

  static ImmutableStructureDefinition.ResourceTypeBuildStage builder() {
    return ImmutableStructureDefinition.builder();
  }
}
