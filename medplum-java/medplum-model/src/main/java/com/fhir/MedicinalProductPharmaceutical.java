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
    as = ImmutableMedicinalProductPharmaceutical.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical {
  Optional<uri> implicitRules();

  Optional<Meta> meta();

  List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> ingredient();

  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> device();

  Optional<Narrative> text();

  String resourceType();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  CodeableConcept administrableDoseForm();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics();

  static ImmutableMedicinalProductPharmaceutical.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical.builder();
  }
}
