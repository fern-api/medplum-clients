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
    as = ImmutableStructureMap.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap {
  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<Uri> url();

  List<StructureMap_Group> group();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<Markdown> purpose();

  Optional<List<StructureMap_Structure>> structure();

  @JsonProperty("import")
  Optional<List<Canonical>> _import();

  Optional<StructuremapStatus> status();

  Optional<List<ContactDetail>> contact();

  Optional<Boolean> experimental();

  Optional<Markdown> copyright();

  Optional<String> version();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> publisher();

  Optional<Markdown> description();

  Optional<Code> language();

  static ImmutableStructureMap.ResourceTypeBuildStage builder() {
    return ImmutableStructureMap.builder();
  }
}
