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
  Optional<Uri> implicitRules();

  Optional<Uri> url();

  Optional<String> publisher();

  Optional<Markdown> purpose();

  Optional<List<StructureMap_Structure>> structure();

  Optional<StructuremapStatus> status();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<String> version();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<List<ContactDetail>> contact();

  Optional<DateTime> date();

  Optional<Markdown> description();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> copyright();

  String resourceType();

  Optional<String> name();

  Optional<List<Identifier>> identifier();

  List<StructureMap_Group> group();

  Optional<String> title();

  @JsonProperty("import")
  Optional<List<Canonical>> _import();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  static ImmutableStructureMap.ResourceTypeBuildStage builder() {
    return ImmutableStructureMap.builder();
  }
}
