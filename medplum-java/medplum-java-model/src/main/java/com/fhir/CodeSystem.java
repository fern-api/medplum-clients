package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCodeSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem {
  Optional<List<Extension>> modifierExtension();

  Optional<String> publisher();

  Optional<List<CodeSystem_Concept>> concept();

  Optional<CodesystemStatus> status();

  Optional<Boolean> experimental();

  Optional<Narrative> text();

  Optional<canonical> supplements();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Extension>> extension();

  Optional<canonical> valueSet();

  Optional<String> version();

  String resourceType();

  Optional<id> id();

  Optional<Boolean> versionNeeded();

  Optional<unsignedInt> count();

  Optional<Meta> meta();

  Optional<Boolean> compositional();

  Optional<List<ContactDetail>> contact();

  Optional<markdown> purpose();

  Optional<CodesystemHierarchymeaning> hierarchyMeaning();

  Optional<List<CodeSystem_Filter>> filter();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<uri> implicitRules();

  Optional<String> title();

  Optional<Boolean> caseSensitive();

  Optional<List<CodeSystem_Property>> property();

  Optional<List<ResourceList>> contained();

  Optional<markdown> description();

  Optional<uri> url();

  Optional<code> language();

  Optional<dateTime> date();

  Optional<List<UsageContext>> useContext();

  Optional<markdown> copyright();

  Optional<CodesystemContent> content();

  static ImmutableCodeSystem.ResourceTypeBuildStage builder() {
    return ImmutableCodeSystem.builder();
  }
}
