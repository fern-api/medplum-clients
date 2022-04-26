package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MedicationAdministration_Dosage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationAdministration_Dosage.builder()}.
 */
@Generated(from = "MedicationAdministration_Dosage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationAdministration_Dosage
    implements MedicationAdministration_Dosage {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept route;
  private final @Nullable Ratio rateRatio;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept method;
  private final @Nullable Quantity dose;
  private final @Nullable String text;
  private final @Nullable CodeableConcept site;
  private final @Nullable Quantity rateQuantity;

  private ImmutableMedicationAdministration_Dosage(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept route,
      @Nullable Ratio rateRatio,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept method,
      @Nullable Quantity dose,
      @Nullable String text,
      @Nullable CodeableConcept site,
      @Nullable Quantity rateQuantity) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.route = route;
    this.rateRatio = rateRatio;
    this.extension = extension;
    this.method = method;
    this.dose = dose;
    this.text = text;
    this.site = site;
    this.rateQuantity = rateQuantity;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code route} attribute
   */
  @JsonProperty("route")
  @Override
  public Optional<CodeableConcept> route() {
    return Optional.ofNullable(route);
  }

  /**
   * @return The value of the {@code rateRatio} attribute
   */
  @JsonProperty("rateRatio")
  @Override
  public Optional<Ratio> rateRatio() {
    return Optional.ofNullable(rateRatio);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code dose} attribute
   */
  @JsonProperty("dose")
  @Override
  public Optional<Quantity> dose() {
    return Optional.ofNullable(dose);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<CodeableConcept> site() {
    return Optional.ofNullable(site);
  }

  /**
   * @return The value of the {@code rateQuantity} attribute
   */
  @JsonProperty("rateQuantity")
  @Override
  public Optional<Quantity> rateQuantity() {
    return Optional.ofNullable(rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationAdministration_Dosage(
        newValue,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationAdministration_Dosage(
        value,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        newValue,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        value,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#route() route} attribute.
   * @param value The value for route
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withRoute(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "route");
    if (this.route == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        newValue,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#route() route} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for route
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withRoute(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.route == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        value,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#rateRatio() rateRatio} attribute.
   * @param value The value for rateRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withRateRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "rateRatio");
    if (this.rateRatio == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        newValue,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#rateRatio() rateRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withRateRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.rateRatio == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        value,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        newValue,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        value,
        this.method,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        newValue,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        value,
        this.dose,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#dose() dose} attribute.
   * @param value The value for dose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withDose(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "dose");
    if (this.dose == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        newValue,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#dose() dose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withDose(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.dose == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        value,
        this.text,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        newValue,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        value,
        this.site,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withSite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        newValue,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withSite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        value,
        this.rateQuantity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Dosage#rateQuantity() rateQuantity} attribute.
   * @param value The value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Dosage withRateQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "rateQuantity");
    if (this.rateQuantity == newValue) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Dosage#rateQuantity() rateQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Dosage withRateQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.rateQuantity == value) return this;
    return new ImmutableMedicationAdministration_Dosage(
        this.id,
        this.modifierExtension,
        this.route,
        this.rateRatio,
        this.extension,
        this.method,
        this.dose,
        this.text,
        this.site,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationAdministration_Dosage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationAdministration_Dosage
        && equalTo((ImmutableMedicationAdministration_Dosage) another);
  }

  private boolean equalTo(ImmutableMedicationAdministration_Dosage another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(route, another.route)
        && Objects.equals(rateRatio, another.rateRatio)
        && Objects.equals(extension, another.extension)
        && Objects.equals(method, another.method)
        && Objects.equals(dose, another.dose)
        && Objects.equals(text, another.text)
        && Objects.equals(site, another.site)
        && Objects.equals(rateQuantity, another.rateQuantity);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code route}, {@code rateRatio}, {@code extension}, {@code method}, {@code dose}, {@code text}, {@code site}, {@code rateQuantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(route);
    h += (h << 5) + Objects.hashCode(rateRatio);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(dose);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(rateQuantity);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationAdministration_Dosage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationAdministration_Dosage{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (route != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("route=").append(route);
    }
    if (rateRatio != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("rateRatio=").append(rateRatio);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (method != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (dose != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("dose=").append(dose);
    }
    if (text != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (site != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("site=").append(site);
    }
    if (rateQuantity != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("rateQuantity=").append(rateQuantity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationAdministration_Dosage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationAdministration_Dosage {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> route = Optional.empty();
    boolean routeIsSet;
    @Nullable Optional<Ratio> rateRatio = Optional.empty();
    boolean rateRatioIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<Quantity> dose = Optional.empty();
    boolean doseIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<Quantity> rateQuantity = Optional.empty();
    boolean rateQuantityIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("route")
    public void setRoute(Optional<CodeableConcept> route) {
      this.route = route;
      this.routeIsSet = true;
    }
    @JsonProperty("rateRatio")
    public void setRateRatio(Optional<Ratio> rateRatio) {
      this.rateRatio = rateRatio;
      this.rateRatioIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("dose")
    public void setDose(Optional<Quantity> dose) {
      this.dose = dose;
      this.doseIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<CodeableConcept> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("rateQuantity")
    public void setRateQuantity(Optional<Quantity> rateQuantity) {
      this.rateQuantity = rateQuantity;
      this.rateQuantityIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> route() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> rateRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> dose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> rateQuantity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationAdministration_Dosage fromJson(Json json) {
    ImmutableMedicationAdministration_Dosage.Builder builder = ImmutableMedicationAdministration_Dosage.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.routeIsSet) {
      builder.route(json.route);
    }
    if (json.rateRatioIsSet) {
      builder.rateRatio(json.rateRatio);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.doseIsSet) {
      builder.dose(json.dose);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.rateQuantityIsSet) {
      builder.rateQuantity(json.rateQuantity);
    }
    return (ImmutableMedicationAdministration_Dosage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationAdministration_Dosage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationAdministration_Dosage instance
   */
  public static MedicationAdministration_Dosage copyOf(MedicationAdministration_Dosage instance) {
    if (instance instanceof ImmutableMedicationAdministration_Dosage) {
      return (ImmutableMedicationAdministration_Dosage) instance;
    }
    return ImmutableMedicationAdministration_Dosage.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .route(instance.route())
        .rateRatio(instance.rateRatio())
        .extension(instance.extension())
        .method(instance.method())
        .dose(instance.dose())
        .text(instance.text())
        .site(instance.site())
        .rateQuantity(instance.rateQuantity())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationAdministration_Dosage MedicationAdministration_Dosage}.
   * <pre>
   * ImmutableMedicationAdministration_Dosage.builder()
   *    .id(String) // optional {@link MedicationAdministration_Dosage#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration_Dosage#modifierExtension() modifierExtension}
   *    .route(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationAdministration_Dosage#route() route}
   *    .rateRatio(com.fhir.types.fhir.Ratio) // optional {@link MedicationAdministration_Dosage#rateRatio() rateRatio}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration_Dosage#extension() extension}
   *    .method(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationAdministration_Dosage#method() method}
   *    .dose(com.fhir.types.fhir.Quantity) // optional {@link MedicationAdministration_Dosage#dose() dose}
   *    .text(String) // optional {@link MedicationAdministration_Dosage#text() text}
   *    .site(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationAdministration_Dosage#site() site}
   *    .rateQuantity(com.fhir.types.fhir.Quantity) // optional {@link MedicationAdministration_Dosage#rateQuantity() rateQuantity}
   *    .build();
   * </pre>
   * @return A new MedicationAdministration_Dosage builder
   */
  public static ImmutableMedicationAdministration_Dosage.Builder builder() {
    return new ImmutableMedicationAdministration_Dosage.Builder();
  }

  /**
   * Builds instances of type {@link MedicationAdministration_Dosage MedicationAdministration_Dosage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationAdministration_Dosage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ROUTE = 0x4L;
    private static final long OPT_BIT_RATE_RATIO = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_METHOD = 0x20L;
    private static final long OPT_BIT_DOSE = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_SITE = 0x100L;
    private static final long OPT_BIT_RATE_QUANTITY = 0x200L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept route;
    private @Nullable Ratio rateRatio;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept method;
    private @Nullable Quantity dose;
    private @Nullable String text;
    private @Nullable CodeableConcept site;
    private @Nullable Quantity rateQuantity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    public final Builder route(CodeableConcept route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = Objects.requireNonNull(route, "route");
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("route")
    public final Builder route(Optional<? extends CodeableConcept> route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = route.orElse(null);
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateRatio(Ratio rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = Objects.requireNonNull(rateRatio, "rateRatio");
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateRatio")
    public final Builder rateRatio(Optional<? extends Ratio> rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = rateRatio.orElse(null);
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#dose() dose} to dose.
     * @param dose The value for dose
     * @return {@code this} builder for chained invocation
     */
    public final Builder dose(Quantity dose) {
      checkNotIsSet(doseIsSet(), "dose");
      this.dose = Objects.requireNonNull(dose, "dose");
      optBits |= OPT_BIT_DOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#dose() dose} to dose.
     * @param dose The value for dose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dose")
    public final Builder dose(Optional<? extends Quantity> dose) {
      checkNotIsSet(doseIsSet(), "dose");
      this.dose = dose.orElse(null);
      optBits |= OPT_BIT_DOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(CodeableConcept site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<? extends CodeableConcept> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateQuantity(Quantity rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = Objects.requireNonNull(rateQuantity, "rateQuantity");
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Dosage#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateQuantity")
    public final Builder rateQuantity(Optional<? extends Quantity> rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = rateQuantity.orElse(null);
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Builds a new {@link MedicationAdministration_Dosage MedicationAdministration_Dosage}.
     * @return An immutable instance of MedicationAdministration_Dosage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationAdministration_Dosage build() {
      return new ImmutableMedicationAdministration_Dosage(id, modifierExtension, route, rateRatio, extension, method, dose, text, site, rateQuantity);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean routeIsSet() {
      return (optBits & OPT_BIT_ROUTE) != 0;
    }

    private boolean rateRatioIsSet() {
      return (optBits & OPT_BIT_RATE_RATIO) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean doseIsSet() {
      return (optBits & OPT_BIT_DOSE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean rateQuantityIsSet() {
      return (optBits & OPT_BIT_RATE_QUANTITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationAdministration_Dosage is strict, attribute is already set: ".concat(name));
    }
  }
}
