package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceProtein.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceProtein {
  Optional<code> language();

  Optional<List<String>> disulfideLinkage();

  Optional<List<ResourceList>> contained();

  Optional<Integer> numberOfSubunits();

  Optional<Meta> meta();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<CodeableConcept> sequenceType();

  Optional<List<SubstanceProtein_Subunit>> subunit();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  static ImmutableSubstanceProtein.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceProtein.builder();
  }
}
