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
    as = ImmutableSearchParameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter {
  String resourceType();

  Optional<SearchparameterStatus> status();

  Optional<String> name();

  Optional<SearchparameterType> type();

  Optional<Markdown> description();

  Optional<List<Code>> target();

  Optional<List<String>> chain();

  Optional<Narrative> text();

  Optional<Boolean> multipleOr();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<String> publisher();

  Optional<Boolean> multipleAnd();

  Optional<List<SearchparameterModifierItem>> modifier();

  Optional<List<Code>> base();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<SearchparameterXpathusage> xpathUsage();

  Optional<Code> language();

  Optional<Canonical> derivedFrom();

  Optional<List<SearchparameterComparatorItem>> comparator();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> purpose();

  Optional<List<SearchParameter_Component>> component();

  Optional<List<ContactDetail>> contact();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<String> expression();

  Optional<Boolean> experimental();

  Optional<Uri> url();

  Optional<Code> code();

  Optional<String> xpath();

  Optional<String> version();

  Optional<List<UsageContext>> useContext();

  Optional<Uri> implicitRules();

  static ImmutableSearchParameter.ResourceTypeBuildStage builder() {
    return ImmutableSearchParameter.builder();
  }
}
